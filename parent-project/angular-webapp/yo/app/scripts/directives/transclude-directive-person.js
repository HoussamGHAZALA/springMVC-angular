angular.module('angularWebappApp').directive('personDirective', function() {
  return {
      restrict: 'E',
      transclude: true,
      scope: {person:"="},
      template: '<div></div>'
    	       +'<div ng-transclude> </div>',
      link: function (scope, element, attrs) {
    	  scope.header = "Hello Form Directive to :";
    	  scope.person = {
    		nom : "Houssam From Directive",
    		prenom : "GHAZALA From Directive"
    	  };
      }
  
  
  }
});