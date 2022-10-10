function getPartialUrl(name) {
    return "/static/app/partials/" + name + ".html";
}

// app initialization
var app = angular.module('itemsApp', []);

//This configures the routes and associates each route with a view and a controller
app.config(function ($routeProvider) {
    $routeProvider
        .when('/popular',
        {
            controller: 'PopularItemsController',
            templateUrl: getPartialUrl('popular')
        })
        .when('/popular/page/:page',
        {
            controller: 'PopularItemsController',
            templateUrl: getPartialUrl('popular')
        })
        .when('/redir',
        {
            controller: 'SimpleController',
            templateUrl: getPartialUrl('redir')
        })
        .when('/all/filter/:filter',
        {
            controller: 'PopularItemsController',
            templateUrl: getPartialUrl('popular')
        })
        .when('/latest',
        {
            controller: 'LatestItemsController',
            templateUrl: getPartialUrl('latest')
        })
        .when('/latest/page/:page',
        {
            controller: 'LatestItemsController',
            templateUrl: getPartialUrl('latest')
        })
        .when('/carousel',
        {
            controller: 'PopularItemsController',
            templateUrl: getPartialUrl('carousel')
        })
        .when('/archive',
        {
            controller: 'ArchiveItemsController',
            templateUrl: getPartialUrl('archive')
        })
        .when('/about',
        {
            controller: 'SimpleController',
            templateUrl: getPartialUrl('about')
        })
        .when('/contact',
        {
            controller: 'SimpleController',
            templateUrl: getPartialUrl('contact')
        })
        .otherwise({ redirectTo: '/popular' });
});
