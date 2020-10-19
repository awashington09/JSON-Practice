package com.mpls;

//Attachment attachment = new Attachment("Required plain-text summary of the attachment.", "#36a64f", "Optional text that appears above the attachment block","Bobby Tables","http://flickr.com/bobby/","http://flickr.com/icons/bobby.jpg")
// the above instatiation needs to go in main class.
public class Attachment {
   private String fallback;
   private String color;
   private String preText;
   private String author_name;
   private String author_link;
   private String author_icon;
   private String title;
   private String title_link;
   private String text;
   private Fields fields;
   private String im_url;
   private String thumb_url;
   private String footer;
   private String footer_icon;
   private int ts;

    public String getFallback() {
        return fallback;
    }

    public void setFallback(String fallback) {
        this.fallback = fallback;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPreText() {
        return preText;
    }

    public void setPreText(String preText) {
        this.preText = preText;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getAuthor_link() {
        return author_link;
    }

    public void setAuthor_link(String author_link) {
        this.author_link = author_link;
    }

    public String getAuthor_icon() {
        return author_icon;
    }

    public void setAuthor_icon(String author_icon) {
        this.author_icon = author_icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle_link() {
        return title_link;
    }

    public void setTitle_link(String title_link) {
        this.title_link = title_link;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Fields getFields() {
        return fields;
    }

    public void setFields(Fields fields) {
        this.fields = fields;
    }

    public String getIm_url() {
        return im_url;
    }

    public void setIm_url(String im_url) {
        this.im_url = im_url;
    }

    public String getThumb_url() {
        return thumb_url;
    }

    public void setThumb_url(String thumb_url) {
        this.thumb_url = thumb_url;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public String getFooter_icon() {
        return footer_icon;
    }

    public void setFooter_icon(String footer_icon) {
        this.footer_icon = footer_icon;
    }

    public int getTs() {
        return ts;
    }

    public void setTs(int ts) {
        this.ts = ts;
    }


    public Attachment(String fallback, String color, String preText, String author_name, String author_link, String author_icon, String title, String title_link, String text,  Fields fields, String im_url, String thumb_url, String footer, String footer_icon, int ts) {
        this.fallback = fallback;
        this.color = color;
        this.preText = preText;
        this.author_name = author_name;
        this.author_link = author_link;
        this.author_icon = author_icon;
        this.title = title;
        this.title_link = title_link;
        this.text = text;
        this.fields = fields;
        this.im_url = im_url;
        this.thumb_url = thumb_url;
        this.footer = footer;
        this.footer_icon = footer_icon;
        this.ts = ts;
    }

    public class Fields {
        String title;
        String value;
        boolean isShort;

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public boolean isShort() {
            return isShort;
        }

        public void setShort(boolean aShort) {
            isShort = aShort;
        }

        public Fields(String title, String value, boolean isShort) {
            this.title = title;
            this.value = value;
            this.isShort = isShort;
        }



}




}