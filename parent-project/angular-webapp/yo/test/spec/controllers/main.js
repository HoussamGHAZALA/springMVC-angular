'use strict';

describe('Controller: MainCtrl', function () {

  // load the controller's module
  beforeEach(module('angularWebappApp'));

  var MainCtrl,
    scope, httpBackend;
  var person = {id:1,nom:"GHAZALA",prenom:"Houssam"};

  // Initialize the controller and a mock scope
  beforeEach(inject(function ($controller, $rootScope, $httpBackend) {
    scope = $rootScope.$new();
    MainCtrl = $controller('MainCtrl', {
      $scope: scope
    });
    httpBackend = $httpBackend;
  }));

  it('should attach a list of awesomeThings to the scope', function () {
	  httpBackend.when('GET',
			  			'http://localhost:8080/jersey-rest/api/resource/person?id=1')
			  	 .respond(person);
	  httpBackend.flush();
	  expect(scope.person.id).toBe(1);
	  expect(scope.person.nom).toBe("GHAZALA");
	  expect(scope.person.prenom).toBe("Houssam")
  });
});
