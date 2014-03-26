package org.esa.beam.operator.mph_chl;


import org.esa.beam.framework.datamodel.Band;
import org.esa.beam.framework.datamodel.Product;
import org.esa.beam.framework.datamodel.ProductNodeFilter;
import org.esa.beam.framework.gpf.pointop.ProductConfigurer;

public class TestProductConfigurer implements ProductConfigurer {

    private Product targetProduct;
    private boolean isCopyGeoCodingCalled;

    public TestProductConfigurer() {
        targetProduct = new Product("ZAPP", "schnuffi", 2, 2);
        isCopyGeoCodingCalled = false;
    }

    @Override
    public Product getSourceProduct() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setSourceProduct(Product sourceProduct) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Product getTargetProduct() {
        return targetProduct;
    }

    @Override
    public void copyMetadata() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void copyTimeCoding() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void copyGeoCoding() {
        isCopyGeoCodingCalled = true;
    }

    public boolean isCopyGeoCodingCalled() {
        return isCopyGeoCodingCalled;
    }

    @Override
    public void copyMasks() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void copyTiePointGrids(String... gridName) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void copyBands(String... bandName) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void copyBands(ProductNodeFilter<Band> filter) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void copyVectorData() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Band addBand(String name, int dataType) {
        return targetProduct.addBand(name, dataType);
    }

    @Override
    public Band addBand(String name, int dataType, double noDataValue) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Band addBand(String name, String expression) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Band addBand(String name, String expression, double noDataValue) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}