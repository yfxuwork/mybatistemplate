package cn.learnmybatis.work.domain;



/**
 * 职位表 padata_two
 * 
 * @author ruoyi
 * @date 2018-10-31
 */
public class PadataTwo
{
	private static final long serialVersionUID = 1L;
	
	/** 自增id */
	private Integer id;
	/** 职位名 */
	private String zhiweiming;
	/** 薪资 */
	private String xinzi;
	/** 公司名 */
	private String gongsiming;
	/** 地点时间 */
	private String didianshijian;
	/** 职位信息 */
	private String zhiweixinxi;
	/** 公司信息 */
	private String gongsixinxi;
	/** 公司地址 */
	private String gongsidizhi;

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setZhiweiming(String zhiweiming) 
	{
		this.zhiweiming = zhiweiming;
	}

	public String getZhiweiming() 
	{
		return zhiweiming;
	}
	public void setXinzi(String xinzi) 
	{
		this.xinzi = xinzi;
	}

	public String getXinzi() 
	{
		return xinzi;
	}
	public void setGongsiming(String gongsiming) 
	{
		this.gongsiming = gongsiming;
	}

	public String getGongsiming() 
	{
		return gongsiming;
	}
	public void setDidianshijian(String didianshijian) 
	{
		this.didianshijian = didianshijian;
	}

	public String getDidianshijian() 
	{
		return didianshijian;
	}
	public void setZhiweixinxi(String zhiweixinxi) 
	{
		this.zhiweixinxi = zhiweixinxi;
	}

	public String getZhiweixinxi() 
	{
		return zhiweixinxi;
	}
	public void setGongsixinxi(String gongsixinxi) 
	{
		this.gongsixinxi = gongsixinxi;
	}

	public String getGongsixinxi() 
	{
		return gongsixinxi;
	}
	public void setGongsidizhi(String gongsidizhi) 
	{
		this.gongsidizhi = gongsidizhi;
	}

	public String getGongsidizhi() 
	{
		return gongsidizhi;
	}


	@Override
	public String toString() {
		return "PadataTwo{" +
				"id=" + id +
				", zhiweiming='" + zhiweiming + '\'' +
				", xinzi='" + xinzi + '\'' +
				", gongsiming='" + gongsiming + '\'' +
				", didianshijian='" + didianshijian + '\'' +
				", zhiweixinxi='" + zhiweixinxi + '\'' +
				", gongsixinxi='" + gongsixinxi + '\'' +
				", gongsidizhi='" + gongsidizhi + '\'' +
				'}';
	}
}
