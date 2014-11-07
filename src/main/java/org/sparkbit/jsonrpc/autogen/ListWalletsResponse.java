package org.sparkbit.jsonrpc.autogen;

/**
 * DO NOT EDIT THIS FILE!
 * 
 * Generated by Barrister Idl2Java: https://github.com/coopernurse/barrister-java
 * 
 * Generated at: Fri Nov 07 11:12:14 PST 2014
 */
public class ListWalletsResponse implements com.bitmechanic.barrister.BStruct {


    public static class Builder {
        private ListWallet[] _wallets;
        public Builder wallets(ListWallet[] wallets) { this._wallets = wallets; return this; }
        public ListWalletsResponse build() {
            return new ListWalletsResponse(this._wallets);
        }

        public Builder() { }
        public Builder(ListWalletsResponse obj) {
            this._wallets = obj.getWallets();
        }
    }

    private ListWallet[] wallets;

    public ListWalletsResponse() {
        super();
    }

    public ListWalletsResponse(java.util.Map _map) throws com.bitmechanic.barrister.RpcException {
        this(
            (ListWallet[])com.bitmechanic.barrister.ArrayTypeConverter.unmarshalList(ListWallet.class, _map.get("wallets"), false)
        );
    }

    @org.codehaus.jackson.annotate.JsonCreator
    public ListWalletsResponse(
            @org.codehaus.jackson.annotate.JsonProperty("wallets") ListWallet[] wallets) {
        super();
        this.wallets = wallets;
    }

    public void setWallets(ListWallet[] wallets) {
        this.wallets = wallets;
    }

    public ListWallet[] getWallets() {
        return this.wallets;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ListWalletsResponse:");
        sb.append(" wallets=").append(wallets);
        return sb.toString();
    }

    @Override
    public boolean equals(Object _other) {
        if (this == _other) { return true; }
        if (_other == null) { return false; }
        if (!(_other instanceof ListWalletsResponse)) { return false; }
        ListWalletsResponse _o = (ListWalletsResponse)_other;
        if (wallets == null && _o.wallets != null) { return false; }
        else if (wallets != null && !java.util.Arrays.equals(wallets, _o.wallets)) { return false; }
        return true;
    }

    @Override
    public int hashCode() {
        int _hash = 1;
        _hash = _hash * 31 + (wallets == null ? 0 : java.util.Arrays.hashCode(wallets));
        return _hash;
    }
}

