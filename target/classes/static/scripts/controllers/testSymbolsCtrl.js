
var tapp = angular.module('tapp',[]);

tapp.controller('testSymbolsCtrl2',function($scope,$http){
	$http.get('/testC/symbol')
		.then(
      		function(response){
      			$scope.records = response.data;
            	console.log(response.status);
            	$scope.record1 = "SUCCESS";
    		}, function(response){
            	console.log(response.status);
            	$scope.record1 = "FAILURE";
          });
});


tapp.controller('testSymbolsCtrl1',function($scope,$http){
	$http.get('/testC/symbolCount')
		.then(
      		function(response){
      			$scope.record2 = response.data;
    		}, function(response){
            	console.log(response.status);
            	$scope.record2 = "FAILURE";
          });
});