package mvc.model;

public class IInsurance {
	private int iId;
	private String iTitle;
	private String iDesc;
	private int 	iPremium;
	public int getiId() {
		return iId;
	}
	public void setiId(int iId) {
		this.iId = iId;
	}
	public String getiTitle() {
		return iTitle;
	}
	@Override
	public String toString() {
		return "IInsurance [iId=" + iId + ", iTitle=" + iTitle + ", iDesc=" + iDesc + ", iPremium=" + iPremium + "]";
	}
	public void setiTitle(String iTitle) {
		this.iTitle = iTitle;
	}
	public String getiDesc() {
		return iDesc;
	}
//	public IInsurance(int iId, String iTitle, String iDesc, int iPremium) {
//		super();
//		this.iId = iId;
//		this.iTitle = iTitle;
//		this.iDesc = iDesc;
//		this.iPremium = iPremium;
//	}
	public void setiDesc(String iDesc) {
		this.iDesc = iDesc;
	}
	public int getiPremium() {
		return iPremium;
	}
	public void setiPremium(int iPremium) {
		this.iPremium = iPremium;
	}
	

}
