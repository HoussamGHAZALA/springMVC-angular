'use strict';

/**
 * @ngdoc function
 * @name angularWebappApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the angularWebappApp
 */
angular.module('angularWebappApp').controller('MainCtrl', ['$scope','$http','mainFactory', function($scope, $http, mainFactory) {
    
    activate();
    function activate(){
    	var person = {};
    	$scope.header = "Hello Form Controller to : ";
    	mainFactory.sayHelloInConsole('Houssam');
        mainFactory.personBy(1).success(successPerson);
        function successPerson(data){
        	person = data;
        }
        $scope.person = person;

    }
  }
]);
