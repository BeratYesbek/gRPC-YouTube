package com.beratyesbek.product.service.grpc;

import com.beratyesbek.grpc.DiscountRequest;
import com.beratyesbek.grpc.DiscountResponse;

public interface DiscountGrpcService {

    DiscountResponse getDiscount(DiscountRequest discountRequest);
}
