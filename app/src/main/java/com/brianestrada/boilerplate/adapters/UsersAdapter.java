package com.brianestrada.boilerplate.adapters;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.brianestrada.boilerplate.R;
import com.brianestrada.boilerplate.models.User;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class UsersAdapter extends RecyclerView.Adapter<UsersAdapter.UserViewHolder> {
    private List<User> userList;

    public UsersAdapter(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item_user, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        User user = userList.get(position);

        holder.tvUsername.setText(user.getUsername());
    }

    @Override
    public int getItemCount() {
        return userList == null ? 0 : userList.size();
    }

    class UserViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.tvUsername)
        TextView tvUsername;

        UserViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
