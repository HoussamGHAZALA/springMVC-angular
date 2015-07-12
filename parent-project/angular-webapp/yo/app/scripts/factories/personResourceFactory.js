angular.module('angularWebappApp').factory('PersonResource', PersonResource);

	PersonResource.$inject = ['$resource','urlConfig'];
	function PersonResource($resource, urlConfig){
		return $resource( urlConfig.urlServer+urlConfig.urlPersonById,
		          			{ 
	                			get: { method: "GET"}
		          			}
		        		)
	} 
