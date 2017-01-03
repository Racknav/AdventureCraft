package adc.core.proxy;

import net.minecraftforge.fml.common.SidedProxy;

public class Proxies {
	@SidedProxy(clientSide = "adc.core.proxy.ProxyClient", serverSide = "adc.core.proxy.ProxyCommon")
	public static ProxyCommon common;
	@SidedProxy(clientSide = "adc.core.proxy.ProxyRenderClient", serverSide = "adc.core.proxy.ProxyRender")
	public static ProxyRender render;
	
}
