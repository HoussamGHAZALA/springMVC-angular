'use strict';

/**
 * @ngdoc function
 * @name angularWebappApp.controller:MainCtrl
 * @description
 * # MainCtrl
 * Controller of the angularWebappApp
 */
angular.module('angularWebappApp').controller('MainCtrl', ['$scope','$http','mainFactory', function($scope, $http, mainFactory) {
    
    mainFactory.sayHello('Houssam');
    
    mainFactory.personBy(1).success(successPerson);
    function successPerson(data){
    	$scope.person = data;
    }
  }
]);
