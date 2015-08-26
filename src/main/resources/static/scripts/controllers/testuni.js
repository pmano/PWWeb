/**
 var app=angular.module('testApp',[]);

app.controller('testCtrl',function($scope) {
  $scope.fname="finally";
  $scope.lname="hurray";
  $scope.fullName = function() {
  		return $scope.fname + " " + $scope.lname;
  }
});

app.controller('testNamesCtrl',function($scope,$http){
  $http.get('http://www.w3schools.com/angular/customers.php').success(function(response){$scope.record=response.records;});
});
**/


app=angular.module('testApp',[]).controller('testCtrl',function($scope) {
  $scope.fname="finally";
  $scope.lname="hurray";
  $scope.fullName = function() {
  		return $scope.fname + " " + $scope.lname;
  }
});

angular.element(document).ready(function(){
  angular.bootstrap(document.getElementById('app2'),['app2']);
});
angular.module('app2',[]).controller('testNamesCtrl',function($scope,$http){
  $http.get('http://www.w3schools.com/angular/customers.php').success(function(response){$scope.record=response.records;});
});
