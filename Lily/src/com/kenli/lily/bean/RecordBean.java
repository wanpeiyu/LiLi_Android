package com.kenli.lily.bean;

import java.io.Serializable;

public class RecordBean implements Serializable{

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    private String url;//下载地址
    private String title;//标题
    private String recordConut;//播放次数
    private String fileName;//文件名称
    private String recordTime;//播放时长
    private boolean isPlay;//是否播放
    private boolean isDownload;//是否下载
    private boolean isDelete;//是否删除
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getRecordConut() {
        return recordConut;
    }
    public void setRecordConut(String recordConut) {
        this.recordConut = recordConut;
    }
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getRecordTime() {
        return recordTime;
    }
    public void setRecordTime(String recordTime) {
        this.recordTime = recordTime;
    }
    public boolean isPlay() {
        return isPlay;
    }
    public void setPlay(boolean isPlay) {
        this.isPlay = isPlay;
    }
    public boolean isDownload() {
        return isDownload;
    }
    public void setDownload(boolean isDownload) {
        this.isDownload = isDownload;
    }
    public boolean isDelete() {
        return isDelete;
    }
    public void setDelete(boolean isDelete) {
        this.isDelete = isDelete;
    }
    
    
    
}
