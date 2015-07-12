'use strict';
angular.module('angularWebappApp').controller('MainCtrl', MainCtrl);

	MainCtrl.$inject = ['$scope','$http','mainFactory'];
    
	function MainCtrl(){
    	activate();
    	function activate(){
        	$scope.header = "Hello Form Controller to : ";
        	
        	mainFactory.sayHelloInConsole('Houssam');

        	mainFactory.personBy(1)
        	           .success(function(data) {
        				   console.log("data  :  ", data);
        				   person = data;})
        			   .failure(function(response){
        				   console.log("Error calling person request !!!")
        			   });
            $scope.person = person;
        }
    }