package md57e72ff9215372e0707d962678803c2b9;


public class LocationDataManager
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.location.LocationListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLocationChanged:(Landroid/location/Location;)V:GetOnLocationChanged_Landroid_location_Location_Handler:Android.Gms.Location.ILocationListenerInvoker, Xamarin.GooglePlayServices.Location\n" +
			"";
		mono.android.Runtime.register ("RX.PositionTracker.Droid.Managers.LocationDataManager, RX.PositionTracker.Droid", LocationDataManager.class, __md_methods);
	}


	public LocationDataManager ()
	{
		super ();
		if (getClass () == LocationDataManager.class)
			mono.android.TypeManager.Activate ("RX.PositionTracker.Droid.Managers.LocationDataManager, RX.PositionTracker.Droid", "", this, new java.lang.Object[] {  });
	}


	public void onLocationChanged (android.location.Location p0)
	{
		n_onLocationChanged (p0);
	}

	private native void n_onLocationChanged (android.location.Location p0);

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
