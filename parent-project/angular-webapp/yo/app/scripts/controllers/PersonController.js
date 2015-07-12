'use strict';
angular.module('angularWebappApp').controller('PersonController', PersonController);
    
	PersonController.$inject = ['$scope', 'PersonResource'];
	
	function PersonController($scope, PersonResource){
		activate();
	    function activate(){
	    	$scope.header = "Hello Form Controller to : ";
	    	$scope.person = PersonResource.get({'id':1}, function(){
	    		console.log("person of $resource: ",$scope.person);
	    	});
	    }
	}