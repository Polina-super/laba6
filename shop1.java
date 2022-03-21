package laba6;

public class shop1 implements SweetFactory {
    @Override
    public ThirdPartyProviders createThirdPartyProviders() {

        return new provider1();
    }

    @Override
    public hierarchy createHierarchy() {

        return new factory1();
    }
}
