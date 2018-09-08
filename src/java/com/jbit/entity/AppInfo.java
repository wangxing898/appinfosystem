package com.jbit.entity;

import java.math.BigDecimal;
import java.util.Date;

public class AppInfo {

    private String flatformname;
    private String categoryLevel1name;
    private String categoryLevel2name;
    private String categoryLevel3name;
    private String statusname;
    private String versionname;

    public String getFlatformname() {
        return flatformname;
    }

    public void setFlatformname(String flatformname) {
        this.flatformname = flatformname;
    }

    public String getCategoryLevel1name() {
        return categoryLevel1name;
    }

    public void setCategoryLevel1name(String categoryLevel1name) {
        this.categoryLevel1name = categoryLevel1name;
    }

    public String getCategoryLevel2name() {
        return categoryLevel2name;
    }

    public void setCategoryLevel2name(String categoryLevel2name) {
        this.categoryLevel2name = categoryLevel2name;
    }

    public String getCategoryLevel3name() {
        return categoryLevel3name;
    }

    public void setCategoryLevel3name(String categoryLevel3name) {
        this.categoryLevel3name = categoryLevel3name;
    }

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname;
    }

    public String getVersionname() {
        return versionname;
    }

    public void setVersionname(String versionname) {
        this.versionname = versionname;
    }

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.id
     *
     * @mbggenerated
     */
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.softwareName
     *
     * @mbggenerated
     */
    private String softwarename;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.APKName
     *
     * @mbggenerated
     */
    private String apkname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.supportROM
     *
     * @mbggenerated
     */
    private String supportrom;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.interfaceLanguage
     *
     * @mbggenerated
     */
    private String interfacelanguage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.softwareSize
     *
     * @mbggenerated
     */
    private BigDecimal softwaresize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.updateDate
     *
     * @mbggenerated
     */
    private Date updatedate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.devId
     *
     * @mbggenerated
     */
    private Long devid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.appInfo
     *
     * @mbggenerated
     */
    private String appinfo;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.status
     *
     * @mbggenerated
     */
    private Long status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.onSaleDate
     *
     * @mbggenerated
     */
    private Date onsaledate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.offSaleDate
     *
     * @mbggenerated
     */
    private Date offsaledate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.flatformId
     *
     * @mbggenerated
     */
    private Long flatformid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.categoryLevel3
     *
     * @mbggenerated
     */
    private Long categorylevel3;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.downloads
     *
     * @mbggenerated
     */
    private Long downloads;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.createdBy
     *
     * @mbggenerated
     */
    private Long createdby;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.creationDate
     *
     * @mbggenerated
     */
    private Date creationdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.modifyBy
     *
     * @mbggenerated
     */
    private Long modifyby;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.modifyDate
     *
     * @mbggenerated
     */
    private Date modifydate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.categoryLevel1
     *
     * @mbggenerated
     */
    private Long categorylevel1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.categoryLevel2
     *
     * @mbggenerated
     */
    private Long categorylevel2;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.logoPicPath
     *
     * @mbggenerated
     */
    private String logopicpath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.logoLocPath
     *
     * @mbggenerated
     */
    private String logolocpath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column app_info.versionId
     *
     * @mbggenerated
     */
    private Long versionid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.id
     *
     * @return the value of app_info.id
     *
     * @mbggenerated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.id
     *
     * @param id the value for app_info.id
     *
     * @mbggenerated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.softwareName
     *
     * @return the value of app_info.softwareName
     *
     * @mbggenerated
     */
    public String getSoftwarename() {
        return softwarename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.softwareName
     *
     * @param softwarename the value for app_info.softwareName
     *
     * @mbggenerated
     */
    public void setSoftwarename(String softwarename) {
        this.softwarename = softwarename == null ? null : softwarename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.APKName
     *
     * @return the value of app_info.APKName
     *
     * @mbggenerated
     */
    public String getApkname() {
        return apkname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.APKName
     *
     * @param apkname the value for app_info.APKName
     *
     * @mbggenerated
     */
    public void setApkname(String apkname) {
        this.apkname = apkname == null ? null : apkname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.supportROM
     *
     * @return the value of app_info.supportROM
     *
     * @mbggenerated
     */
    public String getSupportrom() {
        return supportrom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.supportROM
     *
     * @param supportrom the value for app_info.supportROM
     *
     * @mbggenerated
     */
    public void setSupportrom(String supportrom) {
        this.supportrom = supportrom == null ? null : supportrom.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.interfaceLanguage
     *
     * @return the value of app_info.interfaceLanguage
     *
     * @mbggenerated
     */
    public String getInterfacelanguage() {
        return interfacelanguage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.interfaceLanguage
     *
     * @param interfacelanguage the value for app_info.interfaceLanguage
     *
     * @mbggenerated
     */
    public void setInterfacelanguage(String interfacelanguage) {
        this.interfacelanguage = interfacelanguage == null ? null : interfacelanguage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.softwareSize
     *
     * @return the value of app_info.softwareSize
     *
     * @mbggenerated
     */
    public BigDecimal getSoftwaresize() {
        return softwaresize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.softwareSize
     *
     * @param softwaresize the value for app_info.softwareSize
     *
     * @mbggenerated
     */
    public void setSoftwaresize(BigDecimal softwaresize) {
        this.softwaresize = softwaresize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.updateDate
     *
     * @return the value of app_info.updateDate
     *
     * @mbggenerated
     */
    public Date getUpdatedate() {
        return updatedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.updateDate
     *
     * @param updatedate the value for app_info.updateDate
     *
     * @mbggenerated
     */
    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.devId
     *
     * @return the value of app_info.devId
     *
     * @mbggenerated
     */
    public Long getDevid() {
        return devid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.devId
     *
     * @param devid the value for app_info.devId
     *
     * @mbggenerated
     */
    public void setDevid(Long devid) {
        this.devid = devid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.appInfo
     *
     * @return the value of app_info.appInfo
     *
     * @mbggenerated
     */
    public String getAppinfo() {
        return appinfo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.appInfo
     *
     * @param appinfo the value for app_info.appInfo
     *
     * @mbggenerated
     */
    public void setAppinfo(String appinfo) {
        this.appinfo = appinfo == null ? null : appinfo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.status
     *
     * @return the value of app_info.status
     *
     * @mbggenerated
     */
    public Long getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.status
     *
     * @param status the value for app_info.status
     *
     * @mbggenerated
     */
    public void setStatus(Long status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.onSaleDate
     *
     * @return the value of app_info.onSaleDate
     *
     * @mbggenerated
     */
    public Date getOnsaledate() {
        return onsaledate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.onSaleDate
     *
     * @param onsaledate the value for app_info.onSaleDate
     *
     * @mbggenerated
     */
    public void setOnsaledate(Date onsaledate) {
        this.onsaledate = onsaledate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.offSaleDate
     *
     * @return the value of app_info.offSaleDate
     *
     * @mbggenerated
     */
    public Date getOffsaledate() {
        return offsaledate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.offSaleDate
     *
     * @param offsaledate the value for app_info.offSaleDate
     *
     * @mbggenerated
     */
    public void setOffsaledate(Date offsaledate) {
        this.offsaledate = offsaledate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.flatformId
     *
     * @return the value of app_info.flatformId
     *
     * @mbggenerated
     */
    public Long getFlatformid() {
        return flatformid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.flatformId
     *
     * @param flatformid the value for app_info.flatformId
     *
     * @mbggenerated
     */
    public void setFlatformid(Long flatformid) {
        this.flatformid = flatformid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.categoryLevel3
     *
     * @return the value of app_info.categoryLevel3
     *
     * @mbggenerated
     */
    public Long getCategorylevel3() {
        return categorylevel3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.categoryLevel3
     *
     * @param categorylevel3 the value for app_info.categoryLevel3
     *
     * @mbggenerated
     */
    public void setCategorylevel3(Long categorylevel3) {
        this.categorylevel3 = categorylevel3;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.downloads
     *
     * @return the value of app_info.downloads
     *
     * @mbggenerated
     */
    public Long getDownloads() {
        return downloads;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.downloads
     *
     * @param downloads the value for app_info.downloads
     *
     * @mbggenerated
     */
    public void setDownloads(Long downloads) {
        this.downloads = downloads;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.createdBy
     *
     * @return the value of app_info.createdBy
     *
     * @mbggenerated
     */
    public Long getCreatedby() {
        return createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.createdBy
     *
     * @param createdby the value for app_info.createdBy
     *
     * @mbggenerated
     */
    public void setCreatedby(Long createdby) {
        this.createdby = createdby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.creationDate
     *
     * @return the value of app_info.creationDate
     *
     * @mbggenerated
     */
    public Date getCreationdate() {
        return creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.creationDate
     *
     * @param creationdate the value for app_info.creationDate
     *
     * @mbggenerated
     */
    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.modifyBy
     *
     * @return the value of app_info.modifyBy
     *
     * @mbggenerated
     */
    public Long getModifyby() {
        return modifyby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.modifyBy
     *
     * @param modifyby the value for app_info.modifyBy
     *
     * @mbggenerated
     */
    public void setModifyby(Long modifyby) {
        this.modifyby = modifyby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.modifyDate
     *
     * @return the value of app_info.modifyDate
     *
     * @mbggenerated
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.modifyDate
     *
     * @param modifydate the value for app_info.modifyDate
     *
     * @mbggenerated
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.categoryLevel1
     *
     * @return the value of app_info.categoryLevel1
     *
     * @mbggenerated
     */
    public Long getCategorylevel1() {
        return categorylevel1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.categoryLevel1
     *
     * @param categorylevel1 the value for app_info.categoryLevel1
     *
     * @mbggenerated
     */
    public void setCategorylevel1(Long categorylevel1) {
        this.categorylevel1 = categorylevel1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.categoryLevel2
     *
     * @return the value of app_info.categoryLevel2
     *
     * @mbggenerated
     */
    public Long getCategorylevel2() {
        return categorylevel2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.categoryLevel2
     *
     * @param categorylevel2 the value for app_info.categoryLevel2
     *
     * @mbggenerated
     */
    public void setCategorylevel2(Long categorylevel2) {
        this.categorylevel2 = categorylevel2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.logoPicPath
     *
     * @return the value of app_info.logoPicPath
     *
     * @mbggenerated
     */
    public String getLogopicpath() {
        return logopicpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.logoPicPath
     *
     * @param logopicpath the value for app_info.logoPicPath
     *
     * @mbggenerated
     */
    public void setLogopicpath(String logopicpath) {
        this.logopicpath = logopicpath == null ? null : logopicpath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.logoLocPath
     *
     * @return the value of app_info.logoLocPath
     *
     * @mbggenerated
     */
    public String getLogolocpath() {
        return logolocpath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.logoLocPath
     *
     * @param logolocpath the value for app_info.logoLocPath
     *
     * @mbggenerated
     */
    public void setLogolocpath(String logolocpath) {
        this.logolocpath = logolocpath == null ? null : logolocpath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column app_info.versionId
     *
     * @return the value of app_info.versionId
     *
     * @mbggenerated
     */
    public Long getVersionid() {
        return versionid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column app_info.versionId
     *
     * @param versionid the value for app_info.versionId
     *
     * @mbggenerated
     */
    public void setVersionid(Long versionid) {
        this.versionid = versionid;
    }
}