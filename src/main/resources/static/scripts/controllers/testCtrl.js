angular.module('testApp',[]).controller('testCtrl',function($scope, $http) {
	$http.get('/testC/')
			.success(function(response){
				$scope.greeting=response;
			})
});


/*
angular.module('testApp',[]).controller('testCtrl',function($scope) {
  $scope.fname="finally";
  $scope.lname="hurray";
  $scope.fullName = function() {
  		return $scope.fname + " " + $scope.lname;
  }
});
*/