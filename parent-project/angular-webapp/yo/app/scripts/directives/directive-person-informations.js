angular.module('angularWebappApp').directive('personDirective', function() {
  return {
    restrict: 'EA',
    scope:{
    	person : '='
    },
    template: '<div>Ceci est une directive</div>'+
    		  '<div>'+
    		  	'<span>Hello {{person.nom}} {{person.prenom}}</span>'+
    		  '</div>',
  }
});