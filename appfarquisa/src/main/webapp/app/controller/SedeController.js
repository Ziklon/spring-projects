/**
 * Created by Wilber on 21/12/13.
 */

saleModule.controller('SedeController', function($scope, sedeFactory) {
	init();
	$scope.curPage = 0;

	function init() {
		getAll(0);
	}

	function createPagination() {
		console.info("totalCount", $scope.totalCount);
		pagination = new Pagination($scope.totalCount,$scope.curPage);
		$scope.pages = this.pagination.getPages();
		console.info("print ", $scope.pages);
	}

	$scope.goPage = function(page) {
		$scope.curPage =page;
		getAll(page);
	}

	function getAll(page) {
		start = page;
		limit = 10;
		console.info("quuee ", page);

		if (!page) {
			start = 0;
			limit = 10;
		}


		(new sedeFactory({
			"start" : start * limit,
			"limit" : limit
		})).$getAll().then(function(data) {
			$scope.sedes = data.data;
			$scope.totalCount = data.totalCount;
			createPagination();
		});
	}

});

function Pagination(totalCount, curPage) {
	this.curPage = curPage;
	this.pagesInPagination = 5;
	this.rowsPerPage = 10;
	this.totalCount = totalCount;
	this.pages = [];

	this.getPages = function() {
		this.pages = [];
		if (!this.totalCount || this.totalCount == 0)
			return this.pages;
		
		console.info("curPage",this.curPage);
		

		var pages = (this.totalCount + this.rowsPerPage) / this.rowsPerPage;

		var canRight = (pages - this.curPage + 1);
		var canLeft = this.curPage;

		var taken = 0;
		for (i = this.curPage; i < pages && taken < this.pagesInPagination; i++) {
			this.pages.push(i);
			taken++;
		}
		for (i = this.curPage - 1; i >= 0 && taken < this.pagesInPagination; i++) {
			this.pages.push(i);
			taken++;
		}
		this.pages.sort();
		return this.pages;
	}

}