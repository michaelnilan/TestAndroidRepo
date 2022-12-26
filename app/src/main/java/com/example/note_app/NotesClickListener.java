package com.example.note_app;

import androidx.cardview.widget.CardView;

import com.example.note_app.Models.Notes;

public interface NotesClickListener {
    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);
}
