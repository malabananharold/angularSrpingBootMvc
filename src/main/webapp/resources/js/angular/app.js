/**
 * Created by hmalabanan on 5/26/16.
 */
angular.module("springBoot",['ui.router']);


angular.module('springBoot').config(function($stateProvider,$urlRouterProvider){
    $urlRouterProvider.otherwise('/index');

    $stateProvider
        .state('index',{
            url:'/index',
            templateUrl:'indexBody'
        })
});