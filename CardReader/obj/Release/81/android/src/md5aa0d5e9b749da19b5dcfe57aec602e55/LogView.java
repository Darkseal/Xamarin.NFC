package md5aa0d5e9b749da19b5dcfe57aec602e55;


public class LogView
	extends android.widget.TextView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("CommonSampleLibrary.LogView, CommonSampleLibrary", LogView.class, __md_methods);
	}


	public LogView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == LogView.class)
			mono.android.TypeManager.Activate ("CommonSampleLibrary.LogView, CommonSampleLibrary", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public LogView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == LogView.class)
			mono.android.TypeManager.Activate ("CommonSampleLibrary.LogView, CommonSampleLibrary", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public LogView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == LogView.class)
			mono.android.TypeManager.Activate ("CommonSampleLibrary.LogView, CommonSampleLibrary", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}

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