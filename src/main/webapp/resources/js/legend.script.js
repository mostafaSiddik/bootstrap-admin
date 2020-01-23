$(document).ready(function() {
	multiCheckBoxPerform();
	deleteSelectedItems();
});

function multiCheckBoxPerform() {
	// add multiple select / deselect functionality
	$(".all_item_ckbx").click(function() {
		$('.item_ckbx').prop("checked", this.checked);
	});

	// if all checkbox are selected, check the selectall checkbox
	// and viceversa
	$(".item_ckbx").click(function() {
		if ($(".item_ckbx").length == $(".item_ckbx:checked").length) {
			$(".all_item_ckbx").prop("checked", true);
		} else {
			$(".all_item_ckbx").prop("checked", false);
		}
	});
};

function deleteSelectedItems() {
	$("#delete_selected_items").click(function() {
		var favorite = [];
		var del_url;
		$.each($("input[class='item_ckbx']:checked"), function() {
			favorite.push($(this).attr('itemId'));
		});

		del_url = $(this).attr("uri");
		$.ajax({
			url : del_url,
			data : {
				itemIds : favorite
			},
			type : 'POST',
			error : function(data, textStatus, jqXHR) {
				if (data.status != "success")
					alert(data);
			},
			success : function(data) {
				if (data.status == "success") { // if true (1)
					setTimeout(function() {// wait for 5 secs(2)
						location.reload(); // then reload the page.(3)
					}, 5000);
				}
				console.log(data);
			}
		});
	});
};