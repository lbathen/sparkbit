package org.sparkbit.jsonrpc.autogen;

/**
 * DO NOT EDIT THIS FILE!
 * 
 * Generated by Barrister Idl2Java: https://github.com/coopernurse/barrister-java
 * 
 * Generated at: Fri Nov 07 11:12:14 PST 2014
 */
public class AssetTransactionAmount implements com.bitmechanic.barrister.BStruct {


    public static class Builder {
        private String _assetRef;
        public Builder assetRef(String assetRef) { this._assetRef = assetRef; return this; }
        private Long _raw;
        public Builder raw(Long raw) { this._raw = raw; return this; }
        private Double _qty;
        public Builder qty(Double qty) { this._qty = qty; return this; }
        private String _display;
        public Builder display(String display) { this._display = display; return this; }
        private String _name;
        public Builder name(String name) { this._name = name; return this; }
        private String _name_short;
        public Builder name_short(String name_short) { this._name_short = name_short; return this; }
        public AssetTransactionAmount build() {
            return new AssetTransactionAmount(this._assetRef, this._raw, this._qty, this._display, this._name, this._name_short);
        }

        public Builder() { }
        public Builder(AssetTransactionAmount obj) {
            this._assetRef = obj.getAssetRef();
            this._raw = obj.getRaw();
            this._qty = obj.getQty();
            this._display = obj.getDisplay();
            this._name = obj.getName();
            this._name_short = obj.getName_short();
        }
    }

    private Long raw;
    private String name_short;
    private String name;
    private String assetRef;
    private String display;
    private Double qty;

    public AssetTransactionAmount() {
        super();
    }

    public AssetTransactionAmount(java.util.Map _map) throws com.bitmechanic.barrister.RpcException {
        this(
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("assetRef"), true),
            (Long)com.bitmechanic.barrister.IntTypeConverter.unmarshal(_map.get("raw"), false),
            (Double)com.bitmechanic.barrister.FloatTypeConverter.unmarshal(_map.get("qty"), false),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("display"), false),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("name"), false),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("name_short"), false)
        );
    }

    @org.codehaus.jackson.annotate.JsonCreator
    public AssetTransactionAmount(
            @org.codehaus.jackson.annotate.JsonProperty("assetRef") String assetRef, 
            @org.codehaus.jackson.annotate.JsonProperty("raw") Long raw, 
            @org.codehaus.jackson.annotate.JsonProperty("qty") Double qty, 
            @org.codehaus.jackson.annotate.JsonProperty("display") String display, 
            @org.codehaus.jackson.annotate.JsonProperty("name") String name, 
            @org.codehaus.jackson.annotate.JsonProperty("name_short") String name_short) {
        super();
        this.assetRef = assetRef;
        this.raw = raw;
        this.qty = qty;
        this.display = display;
        this.name = name;
        this.name_short = name_short;
    }

    public void setRaw(Long raw) {
        this.raw = raw;
    }

    public Long getRaw() {
        return this.raw;
    }

    public void setName_short(String name_short) {
        this.name_short = name_short;
    }

    public String getName_short() {
        return this.name_short;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAssetRef(String assetRef) {
        this.assetRef = assetRef;
    }

    public String getAssetRef() {
        return this.assetRef;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return this.display;
    }

    public void setQty(Double qty) {
        this.qty = qty;
    }

    public Double getQty() {
        return this.qty;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AssetTransactionAmount:");
        sb.append(" raw=").append(raw);
        sb.append(" name_short=").append(name_short);
        sb.append(" name=").append(name);
        sb.append(" assetRef=").append(assetRef);
        sb.append(" display=").append(display);
        sb.append(" qty=").append(qty);
        return sb.toString();
    }

    @Override
    public boolean equals(Object _other) {
        if (this == _other) { return true; }
        if (_other == null) { return false; }
        if (!(_other instanceof AssetTransactionAmount)) { return false; }
        AssetTransactionAmount _o = (AssetTransactionAmount)_other;
        if (raw == null && _o.raw != null) { return false; }
        else if (raw != null && !raw.equals(_o.raw)) { return false; }
        if (name_short == null && _o.name_short != null) { return false; }
        else if (name_short != null && !name_short.equals(_o.name_short)) { return false; }
        if (name == null && _o.name != null) { return false; }
        else if (name != null && !name.equals(_o.name)) { return false; }
        if (assetRef == null && _o.assetRef != null) { return false; }
        else if (assetRef != null && !assetRef.equals(_o.assetRef)) { return false; }
        if (display == null && _o.display != null) { return false; }
        else if (display != null && !display.equals(_o.display)) { return false; }
        if (qty == null && _o.qty != null) { return false; }
        else if (qty != null && !qty.equals(_o.qty)) { return false; }
        return true;
    }

    @Override
    public int hashCode() {
        int _hash = 1;
        _hash = _hash * 31 + (raw == null ? 0 : raw.hashCode());
        _hash = _hash * 31 + (name_short == null ? 0 : name_short.hashCode());
        _hash = _hash * 31 + (name == null ? 0 : name.hashCode());
        _hash = _hash * 31 + (assetRef == null ? 0 : assetRef.hashCode());
        _hash = _hash * 31 + (display == null ? 0 : display.hashCode());
        _hash = _hash * 31 + (qty == null ? 0 : qty.hashCode());
        return _hash;
    }
}

