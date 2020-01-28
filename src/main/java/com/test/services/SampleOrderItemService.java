package com.test.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.models.SampleOrderItem;

@Service
public interface SampleOrderItemService {

	public SampleOrderItem createSampleOrderItem(SampleOrderItem sampleOrderItem);

	public SampleOrderItem updateSampleOrderItem(Integer id, SampleOrderItem sampleOrderItem);

	public boolean deleteSampleOrderItems(List<Integer> sampleOrderItemIds);

	public SampleOrderItem findSampleOrderItem(Integer id);

	public List<SampleOrderItem> findAllSampleOrderItemBySampleOrderId(Integer sampleOrderId);

	public List<SampleOrderItem> findAllSampleOrderItem();

}
