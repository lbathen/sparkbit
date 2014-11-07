package org.sparkbit.jsonrpc.autogen;

/**
 * DO NOT EDIT THIS FILE!
 * 
 * Generated by Barrister Idl2Java: https://github.com/coopernurse/barrister-java
 * 
 * Generated at: Fri Nov 07 11:07:02 PST 2014
 */
public class AssetTransactionAmountEntry implements com.bitmechanic.barrister.BStruct {


    public static class Builder {
        private String _key;
        public Builder key(String key) { this._key = key; return this; }
        private AssetTransactionAmount _value;
        public Builder value(AssetTransactionAmount value) { this._value = value; return this; }
        public AssetTransactionAmountEntry build() {
            return new AssetTransactionAmountEntry(this._key, this._value);
        }

        public Builder() { }
        public Builder(AssetTransactionAmountEntry obj) {
            this._key = obj.getKey();
            this._value = obj.getValue();
        }
    }

    private AssetTransactionAmount value;
    private String key;

    public AssetTransactionAmountEntry() {
        super();
    }

    public AssetTransactionAmountEntry(java.util.Map _map) throws com.bitmechanic.barrister.RpcException {
        this(
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("key"), false),
            (AssetTransactionAmount)com.bitmechanic.barrister.StructTypeConverter.unmarshal(AssetTransactionAmount.class, _map.get("value"), false)
        );
    }

    @org.codehaus.jackson.annotate.JsonCreator
    public AssetTransactionAmountEntry(
            @org.codehaus.jackson.annotate.JsonProperty("key") String key, 
            @org.codehaus.jackson.annotate.JsonProperty("value") AssetTransactionAmount value) {
        super();
        this.key = key;
        this.value = value;
    }

    public void setValue(AssetTransactionAmount value) {
        this.value = value;
    }

    public AssetTransactionAmount getValue() {
        return this.value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKey() {
        return this.key;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AssetTransactionAmountEntry:");
        sb.append(" value=").append(value);
        sb.append(" key=").append(key);
        return sb.toString();
    }

    @Override
    public boolean equals(Object _other) {
        if (this == _other) { return true; }
        if (_other == null) { return false; }
        if (!(_other instanceof AssetTransactionAmountEntry)) { return false; }
        AssetTransactionAmountEntry _o = (AssetTransactionAmountEntry)_other;
        if (value == null && _o.value != null) { return false; }
        else if (value != null && !value.equals(_o.value)) { return false; }
        if (key == null && _o.key != null) { return false; }
        else if (key != null && !key.equals(_o.key)) { return false; }
        return true;
    }

    @Override
    public int hashCode() {
        int _hash = 1;
        _hash = _hash * 31 + (value == null ? 0 : value.hashCode());
        _hash = _hash * 31 + (key == null ? 0 : key.hashCode());
        return _hash;
    }
}

