angular.element(document).ready(function(){
angular.bootstrap(document.getElementById('app2'),['app2']);
});

angular.module('app2',[])
  .controller('testNamesCtrl',function($scope,$http){
    //$http({method:'JSONP',url:'http://finance.yahoo.com/webservice/v1/symbols/allcurrencies/quote',params:{callback:"JSON_CALLBACK'",format:"json"}})
	//$http({method:'JSONP',url:'http://finance.yahoo.com/webservice/v1/symbols/allcurrencies/quote',params:{format:"json"}})  
	  $http.get('/testC/quote')
  		.then(
        		function(response){
        		$scope.record = response.data.list.resources;
              
              	console.log(response.status);
              	$scope.record1 = "SUCCESS";
      		}, function(response){
              	console.log(response.status);
              	$scope.record1 = "FAILURE";
            });
  });


/*
angular.element(document).ready(function(){
angular.bootstrap(document.getElementById('app2'),['app2']);
});

angular.module('app2',[])
  .controller('testNamesCtrl',function($scope,$http){

  		$http({method:'GET',url:'http://finance.yahoo.com/webservice/v1/symbols/allcurrencies/quote',params:{format:"json"}})
      	.then(
        		function(response){
        			$scope.record = response;
              	$scope.record1 = response;
      		}, function(response){
              	console.log(response);
            });
  });
*/

/*
 angular.module('testApp1',[]).controller('testNamesCtrl',function($scope,$http){
  $http.get('http://www.w3schools.com/angular/customers.php').success(function(response){$scope.record=response.records;});
});
*/

/*
angular.module('app2',[]).controller('testNamesCtrl',function($scope,$http){
  $http.get('http://www.w3schools.com/angular/customers.php').success(function(response){$scope.record=response.records;});
});
*/

/*
angular.element(document).ready(function(){
  angular.bootstrap(document.getElementById('app2'),['app2']);
});
angular.module('app2',[]).controller('testNamesCtrl',function($scope,$http){
  $http.get('http://www.w3schools.com/angular/customers.php').success(function(response){$scope.record=response.records;});
});
*/

/*
angular.element(document).ready(function(){
  angular.bootstrap(document.getElementById('app2'),['app2']);
});

angular.module('app2',[])
  .controller('testNamesCtrl',function($scope,$http){
  		$http.get('http://www.w3schools.com/angular/customers.phpcv')
      	.success(
        		function(response){
        			$scope.record=response.records;
      		})
      	.error(
        		function(response){
              	$scope.record = [
                  {Name:'Jani',Country:'Norway'},
                  {Name:'Hege',Country:'Sweden'},
                  {Name:'Kai',Country:'Denmark'}
                 ];
            });
  });
*/

/*
  angular.element(document).ready(function(){
  angular.bootstrap(document.getElementById('app2'),['app2']);
});

angular.module('app2',[])
  .controller('testNamesCtrl',function($scope,$http){
  		
  		$http.get('http://www.w3schools.com/angular/customers.php')
      	.then(
        		function(response){
        			$scope.record = response.data.records;
              	$scope.record1 = response;
      		}, function(response){
              	$scope.record1 = response;
            });
  });
*/