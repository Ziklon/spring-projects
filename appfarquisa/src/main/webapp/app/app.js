/**
 * Created by Wilber on 21/12/13.
 */

var saleModule= angular.module('saleModule',['ngRoute','ngResource']);


saleModule.config(function ($routeProvider){
    $routeProvider.when('/sede/list',{
        controller:'SedeController',
        templateUrl:'app/views/sede/list.html'
    });
    $routeProvider.otherwise({redirectTo:'/sede/list'});

});




