package com.cuelogic.trainingpoc.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cuelogic.trainingpoc.entity.Review;
import com.cuelogic.trainingpoc.repository.ReviewRepository;

import java.util.List;
import java.util.Optional;


@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public Page<Review> findByProductId(Long id, Pageable pageable){
        return reviewRepository.findByProductId(id, pageable);
    }

    public Optional<Review> findByIdAndProductId(Long id, Long productId){
        return reviewRepository.findByIdAndProductId(id, productId);
    }

    @Transactional
    public Review createOrUpdate(Review review){
        return reviewRepository.save(review);
    }

    @Transactional
    public void deleteById(Long id){
        reviewRepository.deleteById(id);
    }

    public List<Review> findByProductIdAndReviewScore(Long id, Integer score){
        return reviewRepository.findByProductIdAndReviewScore(id, score);
    }

}