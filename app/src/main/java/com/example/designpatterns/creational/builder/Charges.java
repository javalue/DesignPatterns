package com.example.designpatterns.creational.builder;

/**
 * @author tong.xu
 * @date 2020/4/2.
 * description：
 */
public class Charges {

  private Builder builder;

  public Charges(Builder builder) {
    this.builder = builder;
  }

  public void Pay() {
    System.out.println("去支付");
    System.out.println("支付信息" + this.builder.params.id);
    System.out.println("支付信息" + this.builder.params.body);
  }

  /**
   * 参数类
   */
  private static class ChargesParams {

    String id;
    String crete;
    String channel;
    String orderId;
    String amount;
    String clienIp;
    String body;
  }

  /**
   * 构建类
   */
  public static class Builder {

    private ChargesParams params;

    public Builder() {
      this.params = new ChargesParams();
      this.params.id = "10101010";
      this.params.channel = "通道";
      this.params.orderId = "orderId";
      this.params.body = "支付商品详情";
      this.params.clienIp = "192.168.12";
    }

    public Builder id(String id) {
      this.params.id = id;
      return this;
    }

    public Builder crete(String crete) {
      this.params.crete = crete;
      return this;
    }

    public Builder channel(String channel) {
      this.params.channel = channel;
      return this;
    }

    public Builder orderId(String orderId) {
      this.params.orderId = orderId;
      return this;
    }

    public Builder amount(String amount) {
      this.params.amount = amount;
      return this;
    }

    public Builder clienIp(String clienIp) {
      this.params.clienIp = clienIp;
      return this;
    }

    public Builder body(String body) {
      this.params.body = body;
      return this;
    }

    /**
     * 数据处理完毕之后处理逻辑放在构造函数里面
     */
    public Charges builder() {
      return new Charges(this);
    }
  }
}
