public class SemiLuxurySUV implements SemiLuxury{

  private String name;

  public SemiLuxurySUV(String name) {
    this.name = name;
  }

  @Override
  public String getSemiLuxuryFeatures() {
    return "SemiLuxury SUV features";
  }

  @Override
  public String getSemiLuxuryNames() {
    return this.name;
  }
}
