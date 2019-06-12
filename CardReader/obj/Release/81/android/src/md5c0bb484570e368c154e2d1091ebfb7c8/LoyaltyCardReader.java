package md5c0bb484570e368c154e2d1091ebfb7c8;


public class LoyaltyCardReader
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.nfc.NfcAdapter.ReaderCallback
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTagDiscovered:(Landroid/nfc/Tag;)V:GetOnTagDiscovered_Landroid_nfc_Tag_Handler:Android.Nfc.NfcAdapter/IReaderCallbackInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("CardReader.LoyaltyCardReader, CardReader", LoyaltyCardReader.class, __md_methods);
	}


	public LoyaltyCardReader ()
	{
		super ();
		if (getClass () == LoyaltyCardReader.class)
			mono.android.TypeManager.Activate ("CardReader.LoyaltyCardReader, CardReader", "", this, new java.lang.Object[] {  });
	}


	public void onTagDiscovered (android.nfc.Tag p0)
	{
		n_onTagDiscovered (p0);
	}

	private native void n_onTagDiscovered (android.nfc.Tag p0);

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
