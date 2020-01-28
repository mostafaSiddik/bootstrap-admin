package com.test.services.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.test.models.SampleOrderItem;
import com.test.repositories.SampleOrderItemRepository;
import com.test.services.SampleOrderItemService;

@Component
public class SampleOrderItemServiceImpl implements SampleOrderItemService {

	@Autowired
	private SampleOrderItemRepository sampleOrderItemRepository;

	@Override
	public SampleOrderItem createSampleOrderItem(SampleOrderItem sampleOrderItem) {
		return sampleOrderItemRepository.save(sampleOrderItem);
	}

	@Override
	public SampleOrderItem updateSampleOrderItem(Integer id, SampleOrderItem sampleOrderItem) {
		SampleOrderItem smOrderItem = findSampleOrderItem(id);

		smOrderItem.setSample_order_id(sampleOrderItem.getSample_order_id());
		smOrderItem.setCategory_id(sampleOrderItem.getCategory_id());
		smOrderItem.setProduct_id(sampleOrderItem.getProduct_id());
		smOrderItem.setSize_id(sampleOrderItem.getSize_id());
		smOrderItem.setColor_id(sampleOrderItem.getColor_id());
		smOrderItem.setStyle(sampleOrderItem.getStyle());
		smOrderItem.setQuantity(sampleOrderItem.getQuantity());
		smOrderItem.setUnit_price(sampleOrderItem.getUnit_price());
		smOrderItem.setTotal_price(sampleOrderItem.getTotal_price());

		return sampleOrderItemRepository.save(smOrderItem);
	}

	@Override
	public boolean deleteSampleOrderItems(List<Integer> sampleOrderItemIds) {
		try {
			sampleOrderItemIds.stream().forEach(id -> {
				sampleOrderItemRepository.deleteById(id);
			});
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	@Override
	public SampleOrderItem findSampleOrderItem(Integer id) {
		Optional<SampleOrderItem> sampleOrderItem = sampleOrderItemRepository.findById(id);

		return sampleOrderItem.isPresent() ? sampleOrderItem.get() : null;
	}

	@Override
	public List<SampleOrderItem> findAllSampleOrderItemBySampleOrderId(Integer sampleOrderId) {
		return sampleOrderItemRepository.getSampleOrderItemsBySampleOrderId(sampleOrderId).stream()
				.collect(Collectors.toList());
	}

	@Override
	public List<SampleOrderItem> findAllSampleOrderItem() {
		return sampleOrderItemRepository.findAll().stream().collect(Collectors.toList());
	}
}
