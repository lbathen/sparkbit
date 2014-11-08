package org.sparkbit.jsonrpc.autogen;

/**
 * DO NOT EDIT THIS FILE!
 * 
 * Generated by Barrister Idl2Java: https://github.com/coopernurse/barrister-java
 * 
 * Generated at: Fri Nov 07 17:28:18 PST 2014
 */
public class AssetTransaction implements com.bitmechanic.barrister.BStruct {


    public static class Builder {
        private Long _unixtime;
        public Builder unixtime(Long unixtime) { this._unixtime = unixtime; return this; }
        private Long _confirmations;
        public Builder confirmations(Long confirmations) { this._confirmations = confirmations; return this; }
        private Boolean _incoming;
        public Builder incoming(Boolean incoming) { this._incoming = incoming; return this; }
        private AssetTransactionAmount[] _amounts;
        public Builder amounts(AssetTransactionAmount[] amounts) { this._amounts = amounts; return this; }
        private Double _fee;
        public Builder fee(Double fee) { this._fee = fee; return this; }
        private String _txid;
        public Builder txid(String txid) { this._txid = txid; return this; }
        public AssetTransaction build() {
            return new AssetTransaction(this._unixtime, this._confirmations, this._incoming, this._amounts, this._fee, this._txid);
        }

        public Builder() { }
        public Builder(AssetTransaction obj) {
            this._unixtime = obj.getUnixtime();
            this._confirmations = obj.getConfirmations();
            this._incoming = obj.getIncoming();
            this._amounts = obj.getAmounts();
            this._fee = obj.getFee();
            this._txid = obj.getTxid();
        }
    }

    private Double fee;
    private Boolean incoming;
    private AssetTransactionAmount[] amounts;
    private Long unixtime;
    private Long confirmations;
    private String txid;

    public AssetTransaction() {
        super();
    }

    public AssetTransaction(java.util.Map _map) throws com.bitmechanic.barrister.RpcException {
        this(
            (Long)com.bitmechanic.barrister.IntTypeConverter.unmarshal(_map.get("unixtime"), false),
            (Long)com.bitmechanic.barrister.IntTypeConverter.unmarshal(_map.get("confirmations"), false),
            (Boolean)com.bitmechanic.barrister.BoolTypeConverter.unmarshal(_map.get("incoming"), false),
            (AssetTransactionAmount[])com.bitmechanic.barrister.ArrayTypeConverter.unmarshalList(AssetTransactionAmount.class, _map.get("amounts"), false),
            (Double)com.bitmechanic.barrister.FloatTypeConverter.unmarshal(_map.get("fee"), true),
            (String)com.bitmechanic.barrister.StringTypeConverter.unmarshal(_map.get("txid"), false)
        );
    }

    @org.codehaus.jackson.annotate.JsonCreator
    public AssetTransaction(
            @org.codehaus.jackson.annotate.JsonProperty("unixtime") Long unixtime, 
            @org.codehaus.jackson.annotate.JsonProperty("confirmations") Long confirmations, 
            @org.codehaus.jackson.annotate.JsonProperty("incoming") Boolean incoming, 
            @org.codehaus.jackson.annotate.JsonProperty("amounts") AssetTransactionAmount[] amounts, 
            @org.codehaus.jackson.annotate.JsonProperty("fee") Double fee, 
            @org.codehaus.jackson.annotate.JsonProperty("txid") String txid) {
        super();
        this.unixtime = unixtime;
        this.confirmations = confirmations;
        this.incoming = incoming;
        this.amounts = amounts;
        this.fee = fee;
        this.txid = txid;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public Double getFee() {
        return this.fee;
    }

    public void setIncoming(Boolean incoming) {
        this.incoming = incoming;
    }

    public Boolean getIncoming() {
        return this.incoming;
    }

    public void setAmounts(AssetTransactionAmount[] amounts) {
        this.amounts = amounts;
    }

    public AssetTransactionAmount[] getAmounts() {
        return this.amounts;
    }

    public void setUnixtime(Long unixtime) {
        this.unixtime = unixtime;
    }

    public Long getUnixtime() {
        return this.unixtime;
    }

    public void setConfirmations(Long confirmations) {
        this.confirmations = confirmations;
    }

    public Long getConfirmations() {
        return this.confirmations;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public String getTxid() {
        return this.txid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("AssetTransaction:");
        sb.append(" fee=").append(fee);
        sb.append(" incoming=").append(incoming);
        sb.append(" amounts=").append(amounts);
        sb.append(" unixtime=").append(unixtime);
        sb.append(" confirmations=").append(confirmations);
        sb.append(" txid=").append(txid);
        return sb.toString();
    }

    @Override
    public boolean equals(Object _other) {
        if (this == _other) { return true; }
        if (_other == null) { return false; }
        if (!(_other instanceof AssetTransaction)) { return false; }
        AssetTransaction _o = (AssetTransaction)_other;
        if (fee == null && _o.fee != null) { return false; }
        else if (fee != null && !fee.equals(_o.fee)) { return false; }
        if (incoming == null && _o.incoming != null) { return false; }
        else if (incoming != null && !incoming.equals(_o.incoming)) { return false; }
        if (amounts == null && _o.amounts != null) { return false; }
        else if (amounts != null && !java.util.Arrays.equals(amounts, _o.amounts)) { return false; }
        if (unixtime == null && _o.unixtime != null) { return false; }
        else if (unixtime != null && !unixtime.equals(_o.unixtime)) { return false; }
        if (confirmations == null && _o.confirmations != null) { return false; }
        else if (confirmations != null && !confirmations.equals(_o.confirmations)) { return false; }
        if (txid == null && _o.txid != null) { return false; }
        else if (txid != null && !txid.equals(_o.txid)) { return false; }
        return true;
    }

    @Override
    public int hashCode() {
        int _hash = 1;
        _hash = _hash * 31 + (fee == null ? 0 : fee.hashCode());
        _hash = _hash * 31 + (incoming == null ? 0 : incoming.hashCode());
        _hash = _hash * 31 + (amounts == null ? 0 : java.util.Arrays.hashCode(amounts));
        _hash = _hash * 31 + (unixtime == null ? 0 : unixtime.hashCode());
        _hash = _hash * 31 + (confirmations == null ? 0 : confirmations.hashCode());
        _hash = _hash * 31 + (txid == null ? 0 : txid.hashCode());
        return _hash;
    }
}

