var notesongo = angular.module('notesongo', ['restangular', 'ui.utils']);

notesongo.config(function(RestangularProvider) {
        RestangularProvider.setBaseUrl('http://localhost:8080/note');
        RestangularProvider.setOnElemRestangularized(false);
    }
)

function noteController($scope, Restangular) {
    $scope.loadNote = function() {
        Restangular.one('foo').get('', $scope.customer);
    }
}