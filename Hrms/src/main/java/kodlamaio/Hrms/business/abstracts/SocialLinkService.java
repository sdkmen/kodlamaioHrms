package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.dtos.SocialLinkDto;

public interface SocialLinkService {
	Result add(SocialLinkDto socialLinkDto);
	DataResult<List<SocialLinkDto>> getByCandidateId(int candidateId);
}
