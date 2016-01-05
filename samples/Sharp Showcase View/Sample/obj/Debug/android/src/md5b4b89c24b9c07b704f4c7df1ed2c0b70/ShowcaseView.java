package md5b4b89c24b9c07b704f4c7df1ed2c0b70;


public class ShowcaseView
	extends android.widget.RelativeLayout
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnClickListener,
		android.view.View.OnTouchListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_SetShowcaseX:(I)V:__export__\n" +
			"n_SetShowcaseY:(I)V:__export__\n" +
			"n_GetShowcaseX:()I:__export__\n" +
			"n_GetShowcaseY:()I:__export__\n" +
			"n_dispatchDraw:(Landroid/graphics/Canvas;)V:GetDispatchDraw_Landroid_graphics_Canvas_Handler\n" +
			"n_onClick:(Landroid/view/View;)V:GetOnClick_Landroid_view_View_Handler:Android.Views.View/IOnClickListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"n_onTouch:(Landroid/view/View;Landroid/view/MotionEvent;)Z:GetOnTouch_Landroid_view_View_Landroid_view_MotionEvent_Handler:Android.Views.View/IOnTouchListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("SharpShowcaseView.ShowcaseView, ShowcaseView, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null", ShowcaseView.class, __md_methods);
	}


	public ShowcaseView (android.content.Context p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == ShowcaseView.class)
			mono.android.TypeManager.Activate ("SharpShowcaseView.ShowcaseView, ShowcaseView, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0 });
	}


	public ShowcaseView (android.content.Context p0, android.util.AttributeSet p1) throws java.lang.Throwable
	{
		super (p0, p1);
		if (getClass () == ShowcaseView.class)
			mono.android.TypeManager.Activate ("SharpShowcaseView.ShowcaseView, ShowcaseView, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new java.lang.Object[] { p0, p1 });
	}


	public ShowcaseView (android.content.Context p0, android.util.AttributeSet p1, int p2) throws java.lang.Throwable
	{
		super (p0, p1, p2);
		if (getClass () == ShowcaseView.class)
			mono.android.TypeManager.Activate ("SharpShowcaseView.ShowcaseView, ShowcaseView, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public void setShowcaseX (int p0)
	{
		n_SetShowcaseX (p0);
	}

	private native void n_SetShowcaseX (int p0);


	public void setShowcaseY (int p0)
	{
		n_SetShowcaseY (p0);
	}

	private native void n_SetShowcaseY (int p0);


	public int getShowcaseX ()
	{
		return n_GetShowcaseX ();
	}

	private native int n_GetShowcaseX ();


	public int getShowcaseY ()
	{
		return n_GetShowcaseY ();
	}

	private native int n_GetShowcaseY ();


	public void dispatchDraw (android.graphics.Canvas p0)
	{
		n_dispatchDraw (p0);
	}

	private native void n_dispatchDraw (android.graphics.Canvas p0);


	public void onClick (android.view.View p0)
	{
		n_onClick (p0);
	}

	private native void n_onClick (android.view.View p0);


	public boolean onTouch (android.view.View p0, android.view.MotionEvent p1)
	{
		return n_onTouch (p0, p1);
	}

	private native boolean n_onTouch (android.view.View p0, android.view.MotionEvent p1);

	java.util.ArrayList refList;
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
