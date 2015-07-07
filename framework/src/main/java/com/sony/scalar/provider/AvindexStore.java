package com.sony.scalar.provider;

public final class AvindexStore {
    public static final class Images {
        public static final class Folder implements android.provider.BaseColumns {
            public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.sony.scalar.avindex.folder";
            public static final String COUNT_OF_ONE_BEFORE = "count_of_one_before";
            public static final String DCF_FOLDER_NUMBER = "dcf_folder_number";
            public static final String[] ALL_COLUMNS = { _ID, DCF_FOLDER_NUMBER, _COUNT, COUNT_OF_ONE_BEFORE };
            public static final String DEFAULT_SORT_ORDER = "dcf_folder_number ASC";

            public static android.net.Uri getContentUri(String mediaId) { throw new RuntimeException(); }
            public static int getCursorIndex(android.database.Cursor cursor, int dcfFolderNumber) { throw new RuntimeException(); }
        }

        public interface ImageColumns extends android.provider.BaseColumns {
            String CONTENT_CREATED_LOCAL_DATE = "content_created_local_date";
            String CONTENT_CREATED_LOCAL_DATE_TIME = "content_created_local_date_time";
            String CONTENT_CREATED_LOCAL_TIME = "content_created_local_time";
            String CONTENT_CREATED_UTC_DATE = "content_created_utc_date";
            String CONTENT_CREATED_UTC_DATE_TIME = "content_created_utc_date_time";
            String CONTENT_CREATED_UTC_TIME = "content_created_utc_time";
            String DATA = "_data";
            String DCF_FILE_NUMBER = "dcf_file_number";
            String DCF_FOLDER_NUMBER = "dcf_folder_number";
            String EXIST_JPEG = "exist_jpeg";
            String EXIST_MPO = "exist_mpo";
            String EXIST_RAW = "exist_raw";
            String HAS_GPS_INFO = "has_gps_info";
            String IMAGE_CONTENT_TYPE = "content_type";
            String LATITUDE = "latitude";
            String LONGITUDE = "longitude";
            String REC_ORDER = "rec_order";
            String TIME_ZONE = "time_zone";
            String DEFAULT_SORT_ORDER = "_id ASC";
            int CONT_TYPE_AVCHD = 8;
            int CONT_TYPE_DCF = 1;
            int CONT_TYPE_MP4_AVC = 4;
            int CONT_TYPE_MP4_MPEG4 = 2;
            int CONT_TYPE_UNKNOWN = 0;
        }

        public static final class Info {
            public static final String CONTENT_TYPE = "vnd.android.cursor.item/vnd.sony.scalar.avindex.info";
            public static final String AVI_VERSION = "avi_version";
            public static final String[] ALL_COLUMNS = { AVI_VERSION };

            public static String getAvindexId(android.content.ContentResolver resolver, android.net.Uri baseUri) { throw new RuntimeException(); }
            public static String getAvindexId(android.content.ContentResolver resolver, String mediaId) { throw new RuntimeException(); }
            public static String getAvindexVersion(android.content.ContentResolver resolver, android.net.Uri baseUri) { throw new RuntimeException(); }
            public static String getAvindexVersion(android.content.ContentResolver resolver, String mediaId) { throw new RuntimeException(); }
            public static android.net.Uri getContentUri(String mediaId) { throw new RuntimeException(); }
        }

        public static final class LastContent {
            public static final String CONTENT_TYPE = "vnd.android.cursor.item/vnd.sony.scalar.avindex.last";
            public static final String DATA = "_data";
            public static final String DCF_FILE_NUMBER = "dcf_file_number";
            public static final String DCF_FOLDER_NUMBER = "dcf_folder_number";
            public static final String[] ALL_COLUMNS = { DATA, DCF_FOLDER_NUMBER, DCF_FILE_NUMBER };

            public static android.net.Uri getContentUri(String mediaId) { throw new RuntimeException(); }
            public static String getLastContentUniqId(String arg) { throw new RuntimeException(); }
        }

        public static final class LocalDate implements android.provider.BaseColumns {
            public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.sony.scalar.avindex.localdate";
            public static final String CONTENT_CREATED_LOCAL_DATE = "content_created_local_date";
            public static final String COUNT_OF_ONE_BEFORE = "count_of_one_before";
            public static final String[] ALL_COLUMNS = { _ID, CONTENT_CREATED_LOCAL_DATE, _COUNT, COUNT_OF_ONE_BEFORE };
            public static final String DEFAULT_SORT_ORDER = "content_created_local_date ASC";

            public static android.net.Uri getContentUri(String mediaId) { throw new RuntimeException(); }
            public static int getCursorIndex(android.database.Cursor cursor, String contentCreatedLocalDate) { throw new RuntimeException(); }
        }

        public static final class Media implements ImageColumns {
            public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.sony.scalar.avindex";
            public static final String ENTRY_CONTENT_TYPE = "vnd.android.cursor.item/vnd.sony.scalar.avindex";
            public static final String EXTERNAL_DEFAULT_MEDIA_ID = "external";
            public static final String INTERNAL_DEFAULT_MEDIA_ID = "internal";
            public static final String VIRTUAL_DEFAULT_MEDIA_ID = "virtual";
            public static final String[] ALL_COLUMNS = { _ID, DATA, DCF_FOLDER_NUMBER, DCF_FILE_NUMBER, IMAGE_CONTENT_TYPE, EXIST_JPEG, EXIST_MPO, EXIST_RAW, CONTENT_CREATED_LOCAL_DATE_TIME, CONTENT_CREATED_LOCAL_DATE, CONTENT_CREATED_LOCAL_TIME, CONTENT_CREATED_UTC_DATE_TIME, CONTENT_CREATED_UTC_DATE, CONTENT_CREATED_UTC_TIME, HAS_GPS_INFO, TIME_ZONE, LATITUDE, LONGITUDE, REC_ORDER };
            public static final int RELATIVE_ANGLE_MAX = 6;
            public static final int RELATIVE_ANGLE_MIN = -1;
            public static final int RELATIVE_ANGLE_MINUS_180 = 4;
            public static final int RELATIVE_ANGLE_MINUS_270 = 5;
            public static final int RELATIVE_ANGLE_MINUS_90 = 3;
            public static final int RELATIVE_ANGLE_PLUS_180 = 1;
            public static final int RELATIVE_ANGLE_PLUS_270 = 2;
            public static final int RELATIVE_ANGLE_PLUS_90 = 0;
            public static final int RET_SUCCESS_JPG = 1;
            public static final int RET_SUCCESS_MPO = 2;
            public static final int RET_SUCCESS_RAW = 4;

            public static boolean cancelDeleteMultiImage(int arg) { throw new RuntimeException(); }
            public static int deleteGps(android.content.ContentResolver resolver, android.net.Uri baseUri, long id) { throw new RuntimeException(); }
            public static boolean deleteImage(android.content.ContentResolver resolver, android.net.Uri baseUri, long id) { throw new RuntimeException(); }
            public static int deleteMultiImage(android.content.ContentResolver resolver, android.net.Uri baseUri, long[] ids, AvindexDeleteObserver observer) { throw new RuntimeException(); }
            public static android.database.Cursor getContentFocusPoint(android.content.ContentResolver resolver, android.net.Uri baseUri) { throw new RuntimeException(); }
            public static android.net.Uri getContentUri(String mediaId) { throw new RuntimeException(); }
            public static int getCursorIndex(android.database.Cursor cursor, int dcfFolderNumber, int dcfFileNumber) { throw new RuntimeException(); }
            public static int getCursorIndex(android.database.Cursor cursor, String selection, String[] selectionArgs) { throw new RuntimeException(); }
            public static com.sony.scalar.media.AvindexContentInfo getImageInfo(android.content.ContentResolver resolver, android.net.Uri baseUri, long id) { throw new RuntimeException(); }
            public static com.sony.scalar.media.AvindexContentInfo getImageInfo(String data) { throw new RuntimeException(); }
            public static com.sony.scalar.media.AvindexContentInfo getImageInfoFull(android.content.ContentResolver resolver, android.net.Uri baseUri, long id) { throw new RuntimeException(); }
            public static com.sony.scalar.media.AvindexContentInfo getImageInfoFull(String data) { throw new RuntimeException(); }
            public static byte[] getJpegImage(android.content.ContentResolver resolver, android.net.Uri baseUri, long id) { throw new RuntimeException(); }
            public static java.io.InputStream getJpegImageInputStream(android.content.ContentResolver resolver, android.net.Uri baseUri, long id) { throw new RuntimeException(); }
            public static String getMediaId(android.net.Uri uri) { throw new RuntimeException(); }
            public static byte[] getScreennail(android.content.ContentResolver resolver, android.net.Uri baseUri, long id) { throw new RuntimeException(); }
            public static java.io.InputStream getScreennailInputStream(android.content.ContentResolver resolver, android.net.Uri baseUri, long id) { throw new RuntimeException(); }
            public static boolean outputJpegImage(android.content.ContentResolver resolver, android.net.Uri baseUri, long id, java.io.OutputStream output) { throw new RuntimeException(); }
            public static boolean outputScreennail(android.content.ContentResolver resolver, android.net.Uri baseUri, long id, java.io.OutputStream output) { throw new RuntimeException(); }
            public static boolean rotateImage(android.content.ContentResolver resolver, android.net.Uri baseUri, long id, int rotation) { throw new RuntimeException(); }
            public static boolean setContentFocusPoint(android.content.ContentResolver resolver, android.net.Uri baseUri, long id) { throw new RuntimeException(); }
            public static boolean setContentFocusPoint(String data) { throw new RuntimeException(); }
            public static int updateGps(android.content.ContentResolver resolver, android.net.Uri baseUri, long id, android.content.ContentValues arg3) { throw new RuntimeException(); }
        }

        public static final class Thumbnails implements ImageColumns {
            public static final int EXIF_KIND = 1;

            public static android.net.Uri getContentUri(String mediaId) { throw new RuntimeException(); }
            public static android.graphics.Bitmap getThumbnail(android.content.ContentResolver resolver, android.net.Uri baseUri, long id, int arg, android.graphics.BitmapFactory.Options options) { throw new RuntimeException(); }
        }

        public static final class Update {
            public static final String CONTENT_TYPE = "vnd.android.cursor.item/vnd.sony.scalar.avindex.update";

            public static android.net.Uri getContentUri(String mediaId) { throw new RuntimeException(); }
        }

        public static final class UtcDate implements android.provider.BaseColumns {
            public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.sony.scalar.avindex.utcdate";
            public static final String CONTENT_CREATED_UTC_DATE = "content_created_utc_date";
            public static final String COUNT_OF_ONE_BEFORE = "count_of_one_before";
            public static final String[] ALL_COLUMNS = { _ID, CONTENT_CREATED_UTC_DATE, _COUNT, COUNT_OF_ONE_BEFORE };
            public static final String DEFAULT_SORT_ORDER = "content_created_utc_date ASC";

            public static android.net.Uri getContentUri(String mediaId) { throw new RuntimeException(); }
            public static int getCursorIndex(android.database.Cursor cursor, String contentCreatedUtcDate) { throw new RuntimeException(); }
        }

        public static boolean cancelWaitAndUpdateDatabase(android.content.ContentResolver resolver, String mediaId) { throw new RuntimeException(); }
        public static int getAvailableCount(String mediaId) { throw new RuntimeException(); }
        public static int getAvailableCount(String arg1, int arg2) { throw new RuntimeException(); }
        public static int getRecordDirectoryNum(String mediaId) { throw new RuntimeException(); }
        public static boolean waitAndUpdateDatabase(android.content.ContentResolver resolver, String mediaId) { throw new RuntimeException(); }
    }

    public static final String ACTION_AVINDEX_DATABASE_UPDATED = "com.sony.scalar.database.avindex.action.AVINDEX_DATABASE_UPDATED";
    public static final String ACTION_AVINDEX_LOAD_FINISHED = "com.sony.scalar.providers.avindex.action.AVINDEX_LOAD_FINISHED";
    public static final String ACTION_AVINDEX_LOAD_STARTED = "com.sony.scalar.providers.avindex.action.AVINDEX_LOAD_STARTED";
    public static final String ACTION_AVINDEX_MEDIA_AVAILABLE_SIZE_CHANGED = "com.sony.scalar.providers.avindex.action.AVINDEX_MEDIA_AVAILABLE_SIZE_CHANGED";
    public static final String ACTION_MEDIA_SCANNER_SCAN_EXTERNAL_VOLUME = "com.sony.scalar.providers.avindex.action.MEDIA_SCANNER_SCAN_EXTERNAL_VOLUME";
    public static final String AUTHORITY = "com.sony.scalar.providers.avindex";
    public static final int CONTENT_TYPE_LOAD_AVCHD = 4;
    public static final int CONTENT_TYPE_LOAD_DVD_MOVIE = 2;
    public static final int CONTENT_TYPE_LOAD_M2PS = 3;
    public static final int CONTENT_TYPE_LOAD_MP4 = 5;
    public static final int CONTENT_TYPE_LOAD_STILL = 1;
    public static final String EXTRA_AVINDEX_DATABASE_UPDATED_MEDIAID = "com.sony.scalar.database.avindex.extra.mediaid";
    public static final String EXTRA_AVINDEX_MEDIA_AVAILABLE_SIZE_CHANGED_MEDIAID = "com.sony.scalar.providers.avindex.extra.mediaid";
    public static final int MEDIA_TYPE_EXTERNAL = 1;
    public static final int MEDIA_TYPE_INTERNAL = 2;
    public static final int MEDIA_TYPE_VIRTUAL = 4;

    public static boolean calculateAvailableSize(String mediaId) { throw new RuntimeException(); }
    public static boolean cancelWaitLoadMediaComplete(String mediaId) { throw new RuntimeException(); }
    public static long getAvailableSize(String arg) { throw new RuntimeException(); }
    public static String[] getExternalMediaIds() { throw new RuntimeException(); }
    public static String[] getInternalMediaIds() { throw new RuntimeException(); }
    public static com.sony.scalar.media.MediaInfo getMediaInfo(String mediaId) { throw new RuntimeException(); }
    public static String[] getVirtualMediaIds() { throw new RuntimeException(); }
    public static boolean isExistMedia(String mediaId, int mediaType) { throw new RuntimeException(); }
    public static boolean loadMedia(String mediaId, int contentType) { throw new RuntimeException(); }
    public static boolean waitLoadMediaComplete(String mediaId) { throw new RuntimeException(); }
}
