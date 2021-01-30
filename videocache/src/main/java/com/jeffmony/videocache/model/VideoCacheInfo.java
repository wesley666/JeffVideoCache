package com.jeffmony.videocache.model;

import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

public class VideoCacheInfo implements Serializable {
    private String mVideoUrl;                      //视频的url
    private int mVideoType;                        //视频类型
    private long mCachedSize;                      //已经缓存的大小，M3U8文件忽略这个变量
    private long mTotalSize;                       //总大小
    private int mCachedTs;                         //已经缓存的ts个数
    private int mTotalTs;                          //总的ts个数
    private String mMd5;                           //videourl对应的md5
    private String mSavePath;                      //videocacheinfo存储的目录
    private int mLocalPort;                        //本地代理的端口号，每次可能不一样
    private boolean mIsCompleted;                  //文件是否缓存完
    private Map<Integer, Long> mTsLengthMap;       //key表示ts的索引，value表示索引分片的content-length

    public VideoCacheInfo(String url) {
        mVideoUrl = url;
    }

    public String getVideoUrl() {
        return mVideoUrl;
    }

    public void setVideoType(int type) {
        mVideoType = type;
    }

    public int getVideoType() {
        return mVideoType;
    }

    public void setCachedSize(long cachedSize) {
        mCachedSize = cachedSize;
    }

    public long getCachedSize() {
        return mCachedSize;
    }

    public void setTotalSize(long totalSize) {
        mTotalSize = totalSize;
    }

    public long getTotalSize() {
        return mTotalSize;
    }

    public void setCachedTs(int cachedTs) {
        mCachedTs = cachedTs;
    }

    public int getCachedTs() {
        return mCachedTs;
    }

    public void setTotalTs(int totalTs) {
        mTotalTs = totalTs;
    }

    public int getTotalTs() { return mTotalTs; }

    public void setMd5(String md5) { mMd5 = md5; }

    public String getMd5() { return mMd5; }

    public void setSavePath(String savePath) { mSavePath = savePath; }

    public String getSavePath() { return mSavePath; }

    public void setLocalPort(int port) { mLocalPort = port; }

    public int getLocalPort() { return mLocalPort; }

    public void setIsCompleted(boolean isCompleted) { mIsCompleted = isCompleted; }

    public boolean isCompleted() { return mIsCompleted; }

    public void setTsLengthMap(Map<Integer, Long> tsLengthMap) {
        mTsLengthMap = tsLengthMap;
    }

    public Map<Integer, Long> getTsLengthMap() {
        return mTsLengthMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VideoCacheInfo)) return false;
        VideoCacheInfo cacheInfo = (VideoCacheInfo) o;
        return mVideoUrl.equals(cacheInfo.mVideoUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mVideoUrl);
    }

    public String toString() {
        return "VideoCacheInfo[" +
                "url=" + mVideoUrl + "," +
                "type=" + mVideoType + "," +
                "cachedSize=" + mCachedSize + "," +
                "totalSize=" + mTotalSize  + "," +
                "cachedTs=" + mCachedTs + "," +
                "totalTs=" + mTotalTs +
                "]";
    }
}
