angular.module('angularWebappApp').factory('mainFactory', ['$resource','$http','urlConfig', function($resource, $http, urlConfig) {

//	return $resource('http://localhost:8080/jersey-rest/api/resource/person/:id', { id: '@_id' }, {
//	    get: {
//	      method: 'GET'
//	    }
//	  });
	var service = {
		sayHelloInConsole : sayHelloInConsole,
        personBy : personBy
    }
	
	return service;

	
	
	//////////
	function sayHelloInConsole(text){
        console.log("Factory says \"Hello " + text + "\"");
    }
	
	function personBy(id){
		return $http({
            method: "GET",
            url: urlConfig.urlServer+urlConfig.urlPersonById,
            params: {
            	id: id
            }
        });
	}
	
}]);