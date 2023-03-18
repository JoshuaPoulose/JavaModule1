package ISP;

public class USTpermentantEmployees implements BasicDetails, PfDetails {

	@Override
	public void updatePfDetails() {
		System.out.println("updated basic details");

	}

	@Override
	public void updateBasicDetails() {
		System.out.println("updated pf details");

	}

}
