angular.module('angularWebappApp').factory('mainFactory', MainFactory);
	
	MainFactory.$inject = ['$resource','$http','urlConfig'];
    
	function MainFactory($resource, $http, urlConfig){
		
	var service = {
		sayHelloInConsole : sayHelloInConsole,
        personBy : personBy
    }
	
	return service;

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
	}