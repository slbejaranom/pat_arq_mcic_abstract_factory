public class SemiLuxuryCAR implements SemiLuxury {

  private String name;

  public SemiLuxuryCAR(String name) {
    this.name = name;
  }

  @Override
  public String getSemiLuxuryFeatures() {
    return "SemiLuxury CAR features";
  }

  @Override
  public String getSemiLuxuryNames() {
    return this.name;
  }
}
