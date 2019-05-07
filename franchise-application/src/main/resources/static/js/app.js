var franchise = angular.module('franchise',['ngRoute']);

franchise.config(function($routeProvider) {
	  $routeProvider

	  .when('/', {
	    templateUrl : 'home',
	    controller  : 'HomeController'
	  })
	  
	  .when('/display/:id', {
	    templateUrl : 'display',
	    controller  : 'DisplayController'
	  })

	  .otherwise({redirectTo: '/'});
	});

franchise.controller('HomeController',function($scope,$http,$location){
    $scope.submitForm = function(obj) {
    	var url = "http://localhost:9191/franchise/applicationForm";        
        $http.post(url, obj).then(function(data, status) {
            var id=data.data.id;
            $location.path('/display/'+id);
        })
     }   
});

franchise.controller('DisplayController',function($scope,$http,$routeParams){
	var id = $routeParams.id;
	var url = "http://localhost:9191/franchise?id="+id;
    $http.get(url).then(function(res){
    	$scope.applicationDetail = res.data;
    })  
});