package md5cdd85ee222abd4ffe44e635053a2f7bb;


public class CardService
	extends android.nfc.cardemulation.HostApduService
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onDeactivated:(I)V:GetOnDeactivated_IHandler\n" +
			"n_processCommandApdu:([BLandroid/os/Bundle;)[B:GetProcessCommandApdu_arrayBLandroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("CardEmulation.CardService, CardEmulation", CardService.class, __md_methods);
	}


	public CardService ()
	{
		super ();
		if (getClass () == CardService.class)
			mono.android.TypeManager.Activate ("CardEmulation.CardService, CardEmulation", "", this, new java.lang.Object[] {  });
	}


	public void onDeactivated (int p0)
	{
		n_onDeactivated (p0);
	}

	private native void n_onDeactivated (int p0);


	public byte[] processCommandApdu (byte[] p0, android.os.Bundle p1)
	{
		return n_processCommandApdu (p0, p1);
	}

	private native byte[] n_processCommandApdu (byte[] p0, android.os.Bundle p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
