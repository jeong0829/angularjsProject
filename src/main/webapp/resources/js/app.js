var app = angular.module('myApp', ['ngRoute']);

	app.config(function($routeProvider, contextProvider){
		$routeProvider
			.when(
					'/view1/view1_1',
					{
						templateUrl	: contextProvider.getContext()+'.html',
						controller	: 'BodyCtrl' 
					}
				)
					
	});
	


	app.provider('context', function(){
		
		return {
			getContext : function(){
				var href		= location.hash.substring(1, location.hash.length).replace(/ /gi, '%20');
				var start	= 0;
				var end		= href.indexOf("&") == -1 ? href.length : href.indexOf("&");  

				var callURL = href.substring(start, end);
				console.log("현재 HASH : " + callURL+","+start+","+end);
				
				return "/tisoft/resources/view"+callURL;
			},
			$get : function(){
				
			}
		}
	});

	app.directive('url', function(){
		return {
			restrict : 'E',
			template : '<a href="">뷰</a>',
			link : function(scope, element, attrs){
				
				attrs = attrs+'asdad';
			}
			
		}
	});



app.controller('MainCtrl', function($scope){
	
	//console.log(app.getContextPath());
	
	this.getViewPath = function (){
	    var offset=location.href.indexOf(location.host)+location.host.length;
	    var ctxPath=location.href.substring(offset,location.href.indexOf('/',offset+1));
	    
	    return ctxPath+'/resources/view';
	}
	
	$scope.headerPath	= this.getViewPath()+'/common/header.html';
	$scope.leftPath		= this.getViewPath()+'/common/left.html'
});


app.controller('BodyCtrl', function($scope, $http){
	
	//console.log(app.getContextPath());
	
	$http({
		method : 'POST',
		url : 'view1'
	}).success(function(data){
		//alert(data);
	}).error(function(data, status){
		//alert('error : '+status);
	});
	
	$scope.sampleData = 
		[{
			"name" : "정태인",
			"age" : "28"
		},
		{
			"name" : "이한나",
			"age" : "28"
		}];
});