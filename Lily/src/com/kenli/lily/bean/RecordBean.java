package com.kenli.lily.bean;

import java.io.Serializable;

public class RecordBean implements Serializable{

    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    private String url;//���ص�ַ
    private String title;//����
    private String recordConut;//���Ŵ���
    private String fileName;//�ļ�����
    private String recordTime;//����ʱ��
    private boolean isPlay;//�Ƿ񲥷�
    private boolean isDownload;//�Ƿ�����
    private boolean isDelete;//�Ƿ�ɾ��
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
