$(document).ready(function() {
	productTypeChangePerform();
});

function productTypeChangePerform() {
	$("#product_type").change(function() {
		$.ajax({
			url : $(this).attr('uri'),
			data : {
				productTypeId : $(this).val()
			},
			type : 'GET',
			error : function(data, textStatus, jqXHR) {
				if (data.status != "success")
					alert(data);
			},
			success : function(data) {
				if (data != null) {
					addCategoriesRespectToSerach(data);
				}
				console.log(data);
			}
		});
	});
}

function addCategoriesRespectToSerach(data) {
	var element = $('#category');
	element.find('option').not(':first').remove();

	data.forEach(function(category) {
		optionText = category.name;
		optionValue = category.id;
		element.append(`<option value="${optionValue}">${optionText}</option>`);
	});
}